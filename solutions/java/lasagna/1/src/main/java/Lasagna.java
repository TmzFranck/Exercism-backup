public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minute){
        return this.expectedMinutesInOven() - minute;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int minute){
        return minute * 2;
        
    } 

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minute){
        return this.preparationTimeInMinutes(layers) + minute;
    }
    
}
