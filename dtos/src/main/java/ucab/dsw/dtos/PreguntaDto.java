package ucab.dsw.dtos;

import java.util.Date;

public class PreguntaDto extends DtoBase {

    private String pregunta;
    private Date fechacreacion;
    private String status;
    private SubCategoriaDto subcategoria;
    private UsuarioDto idusuario;
    private TipoPreguntaDto tipopregunta;

    public PreguntaDto(long id) throws Exception {
        super(id);
    }

    public PreguntaDto() {
    }

    public String getPregunta() { return pregunta; }
    public void setPregunta(String pregunta) { this.pregunta = pregunta; }

    public Date getFechacreacion() { return fechacreacion; }
    public void setFechacreacion(Date fechacreacion) { this.fechacreacion = fechacreacion; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public SubCategoriaDto getSubcategoria() { return subcategoria; }
    public void setSubcategoria(SubCategoriaDto subcategoria) { this.subcategoria = subcategoria; }

    public UsuarioDto getIdusuario() { return idusuario; }
    public void setIdusuario(UsuarioDto idusuario) { this.idusuario = idusuario; }

    public TipoPreguntaDto getTipopregunta() { return tipopregunta; }
    public void setTipopregunta(TipoPreguntaDto tipopregunta) { this.tipopregunta = tipopregunta; }

}
