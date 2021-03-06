/****************************
*@author: Robbin Woods 15201
*@version: 1.0
*1/10/2016
*PriorityQueue
*****************************/

public interface PriorityQueue<E>{
	public Object getFirst();
	public Object remove();
	public void add(E value);
	public boolean isEmpty();
	public int size();
	public void clear();
}