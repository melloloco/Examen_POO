public class ColorRelleno extends Decorator {

    public ColorRelleno(Shape decoratedShape) {
       super(decoratedShape);		
    }
 
    @Override
    public void draw() {
       decoratedShape.draw();	       
       setRedBorder(decoratedShape);
    }
 
    private void setRedBorder(Shape decoratedShape){
       System.out.println("Color de relleno: Azul");
    }
 }