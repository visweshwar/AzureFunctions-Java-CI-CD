package com.example.functions;

import com.example.functions.model.User;
import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import java.util.Optional;
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;

public class UserHandler extends AzureSpringBootRequestHandler<String,User> {

	@FunctionName("GetUser")
	public User execute(
			@HttpTrigger(name = "req", methods = { HttpMethod.GET}, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<String>> request,
			ExecutionContext context) {
		// Parse query parameter
		String id = request.getQueryParameters().get("id");
		return handleRequest(id, context);
	}

}
