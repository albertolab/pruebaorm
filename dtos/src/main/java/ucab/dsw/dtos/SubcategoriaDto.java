package ucab.dsw.dtos;

<<<<<<< HEAD
public class SubcategoriaDto extends DtoBase {

    private String descripcion;

    private String estatus;

    private CategoriaDto categorias;
=======
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;

public class SubcategoriaDto extends DtoBase{
    private String descripcion;
    private String estatus;

    public SubcategoriaDto()
    {
    }

    public SubcategoriaDto( long id ) throws Exception
    {
        super( id );
    }
>>>>>>> 9eff9b32f1472e0c77891eed1636342c8fd28aa1

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

<<<<<<< HEAD
    public CategoriaDto getCategorias() {
        return categorias;
    }

    public void setCategorias(CategoriaDto categorias) {
        this.categorias = categorias;
    }
=======

>>>>>>> 9eff9b32f1472e0c77891eed1636342c8fd28aa1
}
