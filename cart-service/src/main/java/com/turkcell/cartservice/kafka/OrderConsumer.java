package com.turkcell.cartservice.kafka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class OrderConsumer {
    @Bean
    public Consumer<String> orderCreatedFunction(){ //message yukarıdan gelen stringi ifade ediyor
        return message ->{
            System.out.println(message); //fomnksiyon içimnde fonksiyon tanımlıyormuş gibi düşün bununda
            // nedeni func veriyorum zaten kafkaya
            //diyorum ki bu func tanımım al bu fonk çalıştığında bu mesajı çalıştır
            //operasyonu veririz operasyonu o anda gerrçekleştirmezsiniz de referans gibi taşırsınız
        };
    } //İSMİNİ DOĞRU VERMEM LAZIM DEFİNİTİON NE İSE İSİMİ ONU VER

}
