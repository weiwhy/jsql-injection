package com.test.vendor._cubrid;

import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Ignore;

import com.jsql.model.exception.InjectionFailureException;

@Ignore
public class CubridNormalGetTestNopeSuite extends ConcreteCubridTestNopeSuite {

    public CubridNormalGetTestNopeSuite() throws ClassNotFoundException, SQLException {
        super();
    }

    @Override
    @BeforeClass
    public void setupInjection() throws InjectionFailureException {
//        InjectionModel model = new InjectionModel();
//        MediatorModel.register(model);
//        model.displayVersion();
//
//        MediatorGui.model().addObserver(new SystemOutTerminal());
//
//        ConnectionUtil.setUrlBase("http://"+ AbstractTestSuite.HOSTNAME +"/cubrid_simulate_get.php");
//        ParameterUtil.setQueryString(Arrays.asList(new SimpleEntry<String, String>("lib", "0")));
//        ConnectionUtil.setMethodInjection(MethodInjection.QUERY);
//
//        MediatorGui.model().beginInjection();
//
//        MediatorGui.model().setStrategy(StrategyInjection.NORMAL);
    }
}
