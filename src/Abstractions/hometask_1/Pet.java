package Abstractions.hometask_1;

 abstract public class Pet {
     protected String voice;
     protected int pawsCount;
     public Pet(String voice) {
         this.voice = voice;
     }

     public int getPawsCount() {
         return pawsCount;
     }

     public void setPawsCount(int pawsCount) {
         this.pawsCount = pawsCount;
     }

     public void sleep() {
          System.out.println("Сплю");
      }
      public void play() {
          System.out.println("Играю");
      }
      public void giveVoice() {
          System.out.println("Звук");
      }



}
