package com.ensody.reactivestate.test

import com.ensody.reactivestate.dispatchers
import kotlinx.coroutines.test.TestCoroutineScope

/**
 * Base class for unit testing coroutine based code.
 *
 * On every test run this class automatically sets `MainScope` and [dispatchers] to use a `TestCoroutineDispatcher`.
 *
 * Internally, this uses a [CoroutineTestRule] which does the actual [dispatchers] and `Dispatchers.setMain()` setup.
 * You can access the rule via [coroutineTestRule] in order to e.g. use the [TestCoroutineScope] in your
 * `@Before` setup method.
 */
public abstract class CoroutineTest : CoroutineTestRuleOwner {
    public override val coroutineTestRule: CoroutineTestRule = CoroutineTestRule()
}
