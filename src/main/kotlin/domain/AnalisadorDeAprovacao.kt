package domain
import domain.criterios.CriterioDeAprovacao
import domain.criterios.Basico


class AnalisadorDeAprovacao {

    // ---------------------------------
    //
    //      Seu código deve vir aqui
    //
    //      Defina atributos e métodos conforme especificado
    //      no arquivo de teste encontrado em
    //      'src/test/kotlin/domain/AnalisadorDeAprovacaoTest'
    //
    // ---------------------------------
    
    var criterioAnalisador : CriterioDeAprovacao = Basico()

    fun defineCriterio(criterio : CriterioDeAprovacao) {
        criterioAnalisador = criterio
    }

    fun fechaBoletim(boletim : Boletim) : BoletimFechado{
        val mediaFinal : Double = criterioAnalisador.mediaFinal(boletim);
        val estaAprovado : Boolean = criterioAnalisador.estaAprovado(boletim);

        return BoletimFechado(mediaEPs = boletim.mediaEPs, mediaMiniEPs = boletim.mediaMiniEPs, mediaFinal = mediaFinal, foiAprovado = estaAprovado)

    }
}