package com.example.demo;

public class Task {
   private Integer id;
   private String desc;
   private Boolean isFinished;
   
   
   public void setId(Integer id) {
    this.id = id;
}


   public void setDesc(String desc) {
    this.desc = desc;
   }


   public void setIsFinished(Boolean isFinished) {
    this.isFinished = isFinished;
   }


   public Integer getId() {
    return id;
}


   public String getDesc() {
    return desc;
   }


   public Boolean getIsFinished() {
    return isFinished;
   }


   public Task(Integer id, String desc, Boolean isFinished) {
    this.id = id;
    this.desc = desc;
    this.isFinished = isFinished;
}


}
