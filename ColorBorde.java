public class ColorBorde extends Decorator {

    public ColorBorde(Shape decoratedShape) {
       super(decoratedShape);		
    }
 
    @Override
    public void draw() {
       decoratedShape.draw();	       
       setRedRelleno(decoratedShape);
    }
 
    private void setRedRelleno(Shape decoratedShape){
       System.out.println("Color de Borde: Rojo");
    }
 }