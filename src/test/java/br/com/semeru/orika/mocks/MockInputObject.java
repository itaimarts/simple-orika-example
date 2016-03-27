package br.com.semeru.orika.mocks;

import br.com.semeru.orika.objects.InputAddress;
import br.com.semeru.orika.objects.InputObject;
import java.util.ArrayList;
import java.util.List;

public class MockInputObject {

    private InputObject inputObject = new InputObject();

    public InputObject mockInput() {
        inputObject.setName("Name Test");
        inputObject.setAge(21);
        inputObject.setAdress(mockAddress());
        return inputObject;
    }

    public List<InputObject> mockInputList() {
        List<InputObject> inputObjects = new ArrayList<InputObject>();
        for (int i = 0; i < 3; i++) {
            inputObjects.add(mockInput(i));
        }
        return inputObjects;
    }

    private InputObject mockInput(Integer number) {
        inputObject.setName("Name Test " + number);
        inputObject.setAge(20 + number);
        inputObject.setAdress(mockAddress());
        return inputObject;
    }

    private InputAddress mockAddress() {
        InputAddress address = new InputAddress();
        address.setTown("Old City");
        address.setRoad("Road 01");
        address.setNumber(123);
        return address;
    }
}
