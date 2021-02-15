class a
{
   int x;
   int y;
   int addition(){
      return x+y;
   }
}
class add
{
  publc static void main(String args[])
  {
    a b=new a();
    b.x=2;
    b.y=3;
    System.out.println("sum is "+b.addition);
  }
}
