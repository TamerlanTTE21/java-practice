package Abstractions.hometask_1;

public class Spider extends Pet {
    public Spider(String voice) {
        super(voice);
    }

    @Override
    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
        System.out.println("4");
    }
}
