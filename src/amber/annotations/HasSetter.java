/*
 * Copyright (c) Apoc- 2018
 *
 * File last modfied: 30.01.18 16:54
 */

package amber.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//todo what about static, final fields?
@Target({ElementType.FIELD})
public @interface HasSetter {
}
