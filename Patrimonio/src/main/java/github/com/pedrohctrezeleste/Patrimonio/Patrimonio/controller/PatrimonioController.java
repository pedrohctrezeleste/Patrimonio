package github.com.pedrohctrezeleste.Patrimonio.Patrimonio.controller;

import github.com.pedrohctrezeleste.Patrimonio.Patrimonio.model.Patrimonio;
import github.com.pedrohctrezeleste.Patrimonio.Patrimonio.service.PatrimonioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/patrimonios")

public class PatrimonioController {
    @Autowired

    private PatrimonioService service;

//LISTAR TODOS OS PATRIMONIOS

    @GetMapping
    public String listar(Model model){
        model.addAttribute("ListarPatrimonios",service.listarTodos());
            return "lista";
    }

//FORMULARIO PARA NOVO PATRIMONIO

    @GetMapping("/novo")
    public String novoFormulario(Model model){
        model.addAttribute("patrimonio",new Patrimonio());
            return "formulario";
    }

//FORMULARIO PARA EDITAR PATRIMONIO EXISTENTE

    @GetMapping("/editar/{id}")
    public String editarFormulario(@PathVariable("id") Long id, Model model){
        Optional<Patrimonio> patrimonio = service.BuscarPorId(id);

        if (patrimonio.isPresent()){
            model.addAttribute("patrimonio",patrimonio.get());
            return "formulario";
        }

        return "redirect:/patrimonios";
    }
//SALVAR/ATUALIZAR PATRIMONIO

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute("patrimonio")Patrimonio patrimonio){
        service.Salvar(patrimonio);
        return "redirect:/patrimonios";
    }

//EXCLUIR PATRIMONIO

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id")Long id){
        service.deletar(id);
        return "redirect:/patrimonios";
    }

}
