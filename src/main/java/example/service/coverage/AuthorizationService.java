package example.service.coverage;

import example.domain.AccessControlListObject;
import example.domain.Coverage;
import example.domain.MockOperation;

/**
 * Created by andrei on 3/8/17.
 */
public interface AuthorizationService {

    boolean canExecuteOperationOnCoverage(Coverage coverage, MockOperation mockOperation);

    AccessControlListObject getResultedAclObject(Coverage firstCoverage, Coverage secondCoverage);

}
