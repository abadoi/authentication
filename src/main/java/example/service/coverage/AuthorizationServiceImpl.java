package example.service.coverage;

import example.domain.AccessControlListObject;
import example.domain.Coverage;
import example.domain.MockOperation;
import example.domain.RoleUser;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by andrei on 3/8/17.
 */
public class AuthorizationServiceImpl implements AuthorizationService {

/*    @Override
    public boolean canExecuteOperationOnCoverage(Coverage coverage, MockOperation operation) {
        CurrentUser currentUser = (CurrentUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Map<MockOperation, List<RoleUser>> mockOperationArrayListHashMap = coverage.getAcl().getMockOperationListMap();
        List<RoleUser> roleUserArrayList = mockOperationArrayListHashMap.get(operation);
        if (roleUserArrayList.contains(currentUser.getRole()))
            return true;
//        for(ArrayList<RoleUser> roleUserArrayList : mockOperationArrayListHashMap.values()){
//            if(roleUserArrayList.contains(currentUser.getRole()))
//                return true;
//        }

        return false;
    }*/

//    @Override
//    public AccessControlListObject getResultedAclObject(Coverage firstCoverage, Coverage secondCoverage) {
//        Map<MockOperation, List<RoleUser>> firstMap = firstCoverage.getAcl().getMockOperationListMap();
//        Map<MockOperation, List<RoleUser>> secondMap = secondCoverage.getAcl().getMockOperationListMap();
//
//        HashMap<MockOperation, ArrayList<RoleUser>> resultAcl = new HashMap<MockOperation, ArrayList<RoleUser>>(firstMap);
//
//        for (Map.Entry<MockOperation, List<RoleUser>> entry : resultAcl.entrySet()) {
//            MockOperation key = entry.getKey();
//            List<RoleUser> firstAclValue = entry.getValue();
//            if(secondMap.containsKey(key)){
//                List<RoleUser> secondAclValue = secondMap.get(key);
//                List<RoleUser> resultAclValue = getRolesIntersection(firstAclValue, secondAclValue);
//                resultAcl.put(key, resultAclValue);
//            } else {
//                resultAcl.remove(key);
//            }
//        }
//
//        return new AccessControlListObject(resultAcl);
//    }

    private ArrayList<RoleUser> getRolesIntersection(ArrayList<RoleUser> firstRoleList, ArrayList<RoleUser> secondRoleList){
        ArrayList<RoleUser> result = new ArrayList<RoleUser>(firstRoleList);
        for(RoleUser roleUser : result){
            if(!secondRoleList.contains(roleUser)){
                result.remove(roleUser);
            }
        }

        return result;
    }

    @Override
    public boolean canExecuteOperationOnCoverage(Coverage coverage, MockOperation mockOperation) {
        return false;
    }

    @Override
    public AccessControlListObject getResultedAclObject(Coverage firstCoverage, Coverage secondCoverage) {
        return null;
    }
}
