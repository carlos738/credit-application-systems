package ca.applicationsystemscredit.Exception

data class BusinessException (override val message:
    String?): RuntimeException(message)

