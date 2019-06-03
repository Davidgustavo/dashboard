package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.lang.Math;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class NumeroRandom {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param Entidade
	 * @return Var
	 */
	// numeroRandom
	public static Var Random(Var Entidade) throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				return cronapi.math.Operations.randomInt(Var.valueOf(1), Var.valueOf(999999));
			}
		}.call();
	}

}
