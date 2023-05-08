package view;

import matheus.ListaInt.ListaInt;

public class Main {

	public static void main(String[] args) 
	{
		ListaInt l = new ListaInt();
		int[] vet = {24, 42, 23, 74, 80, 77, 13, 41, 59, 35, 68, 53, 75, 84, 44, 94, 39, 71, 88};
		int tam = vet.length;
		
		for (int i = 0; i < tam; i++)
		{
			try {
				if (l.isEmpty())
				{
					l.addFirst(vet[i] * 2);
				}
				else if (l.size() < 3)
				{
						l.addLast(vet[i] / 2);
				}
				else if (l.size() > 10)
				{
					l.add(vet[i] * 3, 5);
				}
				else
				{
					l.add(vet[i], 1);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		while (!l.isEmpty())
		{
			try {
				if(l.size() > 10)
				{
					System.out.println(l.get(3));
					l.remove(3);
				}
				else if (l.size() > 5)
				{
					System.out.println(l.size() - 1);
					l.removeLast();
				}
				else if (l.size() > 3)
				{
					System.out.println(l.get(1));
					l.remove(1);
				}
				else
				{
					System.out.println(l.get(0));
					l.removeFirst();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
