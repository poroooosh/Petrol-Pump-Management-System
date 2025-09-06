package Interfaces;
import java.lang.*;
import Classes.Oil;

public interface CustomerOperations
{
	boolean insertOil(Oil o);
	boolean removeOil(Oil o);
	Oil searchOil(String tranNo);
	void showAllOils();
}