public class Main {
    public static void main(String[] args) {
        System.out.println("Intial Step--------");
        
        Creator spiderCreator=new SpiderManCreator();
        Human spiderMan=spiderCreator.factoryMethod();
        spiderMan.saveLife();
        spiderMan.popular();
        int power=spiderMan.power(1000);
        System.out.println("The POWER OF SPIDER : "+power);
        
        Creator superCreator=new SuperManCreator();
        Human superMan=superCreator.factoryMethod();
        superMan.saveLife();
        superMan.popular();
        superMan.power(power);
        System.out.println("THE POWER OF SUPER MAN : "+superMan.power(power));
    }
}