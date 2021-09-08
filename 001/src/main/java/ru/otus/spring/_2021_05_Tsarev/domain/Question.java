package ru.otus.spring._2021_05_Tsarev.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public @Data @AllArgsConstructor @NoArgsConstructor
class Question {
    private String question;
    private List<Option> options;

   public String toString(){
       StringBuilder sb = new StringBuilder();
       sb.append("Question: "+question+" "+"/n");
       sb.append("Options:");
       for( Option option :options){
           sb.append(option.getOption()+" ");
       }
       return sb.toString();
   }
}
