package valoracion.exceptions;

import common.definitions.ArchivoModules;
import common.exceptions.ActionNotAllowedException;

/**
 * Exception lanzada si se produce un intento de realizaci�n de una operaci�n no
 * permitida en el m�dulo de eliminacion de series por parte de un usuario de la
 * aplicaci�n.
 */
public class GestionConservadasActionNotAllowedException extends
		ActionNotAllowedException {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public GestionConservadasActionNotAllowedException(int codError) {
		super("Sin permisos", codError, ArchivoModules.FONDOS_MODULE);
	}
}