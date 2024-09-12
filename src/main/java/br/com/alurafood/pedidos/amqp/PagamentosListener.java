package br.com.alurafood.pedidos.amqp;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PagamentosListener {

    @RabbitListener(queues = "pagamento.concluido")
    public void recebeMensagem(Message mensagem){
        System.out.println("Recebei a mensagem: " + mensagem.toString());
    }
}
