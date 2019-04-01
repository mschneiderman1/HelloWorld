package CH9Inheritance.Shapes.JavaFiles;


public class Cone implements Shapes {
        private double radius;
        private double height;
        private double slant;

        public Cone(double radius, double height, double slant){
            this.radius= radius;
            this.height = height;
            this.slant=slant;
        }
        public double getVolume(){
            return Math.PI* radius*radius*(height/3);
        }
        public double getSA(){
            return Math.PI*radius*radius+Math.PI*radius*slant;
        }
    }