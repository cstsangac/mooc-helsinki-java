public class Reformatory {

    private int counter = 0;
    
    public int weight(Person person) {
        // return the weight of the person
        this.counter++;
        return person.getWeight();
    }

    public int totalWeightsMeasured(){
        return this.counter;
    }
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
}
