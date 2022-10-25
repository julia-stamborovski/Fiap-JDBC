package enums;

public enum TipoSaldoEnum {
	TP_ENTRADA(1),
	TP_SAIDA(1);
	
	private final int idEnum;

	private TipoSaldoEnum(int idEnum) {
		this.idEnum = idEnum;
	}

	public int getIdEnum() {
		return idEnum;
	}
}
