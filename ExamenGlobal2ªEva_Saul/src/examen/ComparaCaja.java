package examen;

import java.util.Comparator;

public class ComparaCaja implements Comparator<Caja> {

	@Override
	public int compare(Caja c1, Caja c2) {
		// TODO Auto-generated method stub
		if (c1.getTama�o()==c2.getTama�o()) {
			return c1.getPeso()-c2.getPeso();
		} else {
		return c1.getTama�o()-c2.getTama�o();
		}
	}

}
