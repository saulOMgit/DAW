package examen;

public class Reloj {
	
	 private int _hora,_min,_seg;
	  
	 public Reloj() {
		 
	 }
	 
	 public Reloj(int hora,int min, int seg) {
		 if(hora>23 || min>59 || seg>59) {
			 this._hora=0;
			 this._min=0;
			 this._seg=0;
		 }
		 else {
		 this._hora=hora;
		 this._min=min;
		 this._seg=seg;
		 }
	 }

	public int get_hora() {
		return _hora;
	}

	public void set_hora(int _hora) {
		this._hora = _hora;
	}

	public int get_min() {
		return _min;
	}

	public void set_min(int _min) {
		this._min = _min;
	}

	public int get_seg() {
		return _seg;
	}

	public void set_seg(int _seg) {
		this._seg = _seg;
	}
	
	//En estas funciopes adelantare los minutos y ajustare si se pasan de limite
	public void AdelantaSegundo() {
		this._seg=this._seg+1;
		if(this._seg==60) {
			this._seg=00;
			this._min=this._min+1;
			if(this._min==60) {
				this._min=0;
				this._hora=this._hora+1;
				if(this._hora==24) {
					this._hora=0;
				}
			}
		}
	}
	
	public void RetrasaSegundo() {
		this._seg=this._seg-1;
		if(this._seg==-1) {
			this._seg=59;
			this._min=this._min-1;
			if(this._min==-1) {
				this._min=59;
				this._hora=this._hora-1;
				if(this._hora==-1) {
					this._hora=23;
				}
			}
		}
	}
	public void MuestraHora() {
		System.out.println("Son las "+this._hora+":"+this._min+":"+this._seg);
	}
	

}
