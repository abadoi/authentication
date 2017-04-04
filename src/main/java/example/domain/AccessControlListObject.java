package example.domain;

import java.util.List;
import java.util.Map;


/**
 * Created by andrei on 3/7/17.
 */

public class AccessControlListObject {

    private Map<MockOperation, List<RoleUser>> mockOperationListMap;

    public Map<MockOperation, List<RoleUser>> getMockOperationListMap() {
        return mockOperationListMap;
    }

    public void setMockOperationListMap(Map<MockOperation, List<RoleUser>> mockOperationListMap) {
        this.mockOperationListMap = mockOperationListMap;
    }

    public AccessControlListObject(Map<MockOperation, List<RoleUser>> mockOperationListMap) {
        this.mockOperationListMap = mockOperationListMap;
    }
}
