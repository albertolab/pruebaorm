import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ucab.dsw.dtos.CategoriaDto;
import ucab.dsw.dtos.EncuestaDto;
import ucab.dsw.dtos.EstudioDto;
import ucab.dsw.dtos.UsuarioDto;
import ucab.dsw.entidades.Encuesta;
import java.util.List;

public class encuestaORMWS_Test {

    @Test
    public void addCategoriaTest() throws Exception {
        ucab.dsw.servicio.encuestaORMWS servicio = new ucab.dsw.servicio.encuestaORMWS();
        EncuestaDto encuestaDto = new EncuestaDto();
        java.util.Date fecha = new java.util.Date("22/11/2020");
        encuestaDto.setFechaCreacion(fecha);
        encuestaDto.setEstatus( "C" );
        UsuarioDto usuarioCreador = new UsuarioDto( 1);
        encuestaDto.setUsuarioCreadorDto( usuarioCreador );
        UsuarioDto usuarioAnalista = new UsuarioDto( 1);
        encuestaDto.setUsuarioAnalistaDto( usuarioAnalista );
        EstudioDto estudio = new EstudioDto( 1);
        encuestaDto.setEstudioDto( estudio );
        EncuestaDto resultado = servicio.addEncuesta( encuestaDto );
        Assert.assertNotEquals( resultado.getId(), 0  );
    }

    @Test
    public void showCategoriaTest() throws Exception
    {
        ucab.dsw.servicio.encuestaORMWS servicio = new ucab.dsw.servicio.encuestaORMWS();
        List<Encuesta> encuestas = servicio.showEncuesta();
        Assert.assertFalse("Consulta Realizada con Exito",encuestas.isEmpty());
    }

    @Test
    public void updateCategoriaTest() throws Exception{

        ucab.dsw.servicio.encuestaORMWS servicio = new ucab.dsw.servicio.encuestaORMWS();
        EncuestaDto encuestaDto = new EncuestaDto();
        java.util.Date fecha = new java.util.Date("21/11/2020");
        encuestaDto.setFechaCreacion(fecha);
        encuestaDto.setEstatus( "E" );
        UsuarioDto aux = new UsuarioDto( 1);
        encuestaDto.setUsuarioCreadorDto( aux );
        UsuarioDto aux1 = new UsuarioDto( 1);
        encuestaDto.setUsuarioAnalistaDto( aux1 );
        EstudioDto aux2 = new EstudioDto( 1);
        encuestaDto.setEstudioDto( aux2 );
        EncuestaDto resultado = servicio.editEncuesta(encuestaDto);
        Assert.assertNotEquals( resultado.getId(), 0);
    }

    @Test
    public void deleteCategoriaTest() throws Exception{

        ucab.dsw.servicio.categoriaORMWS servicio = new ucab.dsw.servicio.categoriaORMWS();
        CategoriaDto categoriaDto = new CategoriaDto(1);
        CategoriaDto resultado = servicio.deleteCategoria(categoriaDto);
        Assert.assertNotEquals( resultado.getId(), 0 );

    }
}
