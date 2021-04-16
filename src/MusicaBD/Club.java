package MusicaBD;

public class Club {
	private String cod;
	private String nombre;
	private String sede;
	private String num;
	private String cod_gru;
	
	public Club() {
	}
	
	public Club(String cod, String nombre, String sede, String num, String cod_gru) {
		this.cod = cod;
		this.nombre = nombre;
		this.sede = sede;
		this.num = num;
		this.cod_gru = cod_gru;
	}
	
	public String getCod() {
		return cod;
	}
	public String getNombre() {
		return nombre;
	}
	public String getSede() {
		return sede;
	}
	public String getNum() {
		return num;
	}
	public String getCod_gru() {
		return cod_gru;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public void setCod_gru(String cod_gru) {
		this.cod_gru = cod_gru;
	}
	
	@Override
	public String toString() {
		return "Club [cod=" + cod + ", nombre=" + nombre + ", sede=" + sede + ", num=" + num + ", cod_gru=" + cod_gru
				+ "]";
	}
	
	
}