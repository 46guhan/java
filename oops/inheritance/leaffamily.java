class leaf
{
void leavestype()
{
System.out.println("this is leaf");
}
}
class tealeaf extends leaf
{
void usetealeaf()
{
System.out.println("using tealeaf")
}
}
class hybiscusleaf extends leaf
{
void hybiscuspowder()
{
System.out.println("hybiscuspowder is using skincare");
}
}
public class family
{
public static void main(String args[])
{
tealeaf g = new tealeaf();
hybiscusleaf h= new hybiscusleaf();

g.leavestype();
g.usetealeaf();

h.leavestype();
h.hybiscuspowder();
}
}