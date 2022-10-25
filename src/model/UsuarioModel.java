package model;

import java.time.LocalDateTime;

public class UsuarioModel {
	
	private Integer idUsuario;
	private String nmUsuario;
	private String dsSenha;
	private String dsEmail;
//	private LocalDateTime dtInclusao;
	
	public UsuarioModel(Integer idUsuario, String nmUsuario, String dsSenha, String dsEmail
//			, LocalDateTime dtInclusao
			) {
		super();
		this.idUsuario = idUsuario;
		this.nmUsuario = nmUsuario;
		this.dsSenha = dsSenha;
		this.dsEmail = dsEmail;
//		this.dtInclusao = dtInclusao;
	}
	
	public UsuarioModel() {}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNmUsuario() {
		return nmUsuario;
	}

	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}

	public String getDsSenha() {
		return dsSenha;
	}

	public void setDsSenha(String dsSenha) {
		this.dsSenha = dsSenha;
	}

	public String getDsEmail() {
		return dsEmail;
	}

	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}
	
//	public LocalDateTime getDtInclusao() {
//		return dtInclusao;
//	}
//
//	public void setDtInclusao(LocalDateTime dtInclusao) {
//		this.dtInclusao = dtInclusao;
//	}

	@Override
	public String toString() {
		return "UsuarioModel [idUsuario=" + idUsuario + ", nmUsuario=" + nmUsuario + ", dsSenha=" + dsSenha
				+ ", dsEmail=" + dsEmail + 
//				", dtInclusao=" + dtInclusao + 
				"]";
	}
	
}
