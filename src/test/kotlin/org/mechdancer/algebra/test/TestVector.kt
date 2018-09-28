package org.mechdancer.algebra.test

import org.junit.Assert
import org.junit.Test
import org.mechdancer.algebra.vector.impl.Vector2D
import org.mechdancer.algebra.vector.impl.Vector3D
import org.mechdancer.algebra.vector.unaryMinus
import org.mechdancer.algebra.vector.x
import kotlin.math.sqrt

class TestVector {
	@Test
	fun test2DVector() {

		val vector2D = Vector2D(1.0, 1.0)

		Assert.assertEquals(2, vector2D.dimension)
		Assert.assertEquals(1.0, vector2D.x, .0)
		Assert.assertEquals(sqrt(2.0), vector2D.norm, .0)
		Assert.assertEquals(Vector2D(3.0, 3.0), vector2D + Vector2D(2.0, 2.0))
		Assert.assertEquals(Vector2D(2.0, 2.0), vector2D * 2.0)
		Assert.assertEquals(Vector2D(-1.0, -1.0), -vector2D)
	}

	@Test
	fun test3DVector() {
		val vector3D = Vector3D(1.0, 1.0, 1.0)

		Assert.assertEquals(Vector3D(1.0, -2.0, 1.0), vector3D cross Vector3D(3.0, 4.0, 5.0))
	}
}
