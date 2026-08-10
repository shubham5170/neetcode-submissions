class Solution {
    class Car
    {
        int position;
        int speed;
        Car(int position, int speed)
        {
            this.position=position;
            this.speed=speed;
        }
    }
    public int carFleet(int target, int[] position, int[] speed) {
        List<Car> cars = new ArrayList<>();
        Stack<Double> stack = new Stack<>();
        for(int i=0;i<position.length;i++)
        {
            cars.add(new Car(position[i],speed[i]));
        }
        cars.sort((Car c1, Car c2) -> c2.position-c1.position);

        for(Car car:cars)
        {
            Double timeTaken = (target-car.position)/(1.0*car.speed);
            if(!stack.isEmpty() && stack.peek()>=timeTaken)
            {

            }
            else
            stack.push(timeTaken);
        }

        return stack.size();    
    }
}
