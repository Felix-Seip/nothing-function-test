FROM 559465927328.dkr.ecr.eu-central-1.amazonaws.com/nothing-invoker/invoker-function-base:latest

ADD build/libs/*.jar $LAMBDA_TASK_ROOT/lib/
ENV ENV_FUNCTION_PACKAGE=com.test.function