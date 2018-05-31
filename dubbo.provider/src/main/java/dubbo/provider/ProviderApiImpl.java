package dubbo.provider;

import dubbo.api.SharedService;

public class ProviderApiImpl implements SharedService {
    public String sayHello(String name) {
        return "hello , "+name;
    }
}
