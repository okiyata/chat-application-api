package com.alibou.websocket.enums;

public enum OrderEvent {
    REQ_RECEIVED,           //Transition from REQUESTING to REQUEST_AWAIT_APPROVAL
    REQ_PROCESS,            //Transition from REQ_AWAIT_APPROVAL to REQ_APPROVAL_PROCESS
    REQ_APPROVE,            //Transition from REQ_AWAIT_APPROVAL to ASSIGN_STAFF
    REQ_DECLINE,            //Transition FROM REQ_CANCEL to CANCEL
    ASSIGN_STAFF,           //Transition FROM AWAIT_ASSIGN_STAFF TO IN_EXCHANGING
    FINALIZE_IDEA,          //Transition from IN_EXCHANGING to AWAIT_QUO

    QUO_FINISH,             //Transition from AWAIT_QUO TO QUO_AWAIT_MANA_APPROVAL
    QUO_MANA_PROCESS,       //Transition from QUO_AWAIT_MANA_APPROVAL to QUO_MANA_APPROVAL_PROCESS
    QUO_MANA_APPROVE,       //Transition from QUO_MANA_APPROVED to QUO_AWAIT_CUST_APPROVAL
    QUO_MANA_DECLINE,       //Transition from QUO_MANA_DECLINED to AWAIT_QUO
    QUO_CUST_PROCESS,       //Transition from QUO_AWAIT_CUST_APPROVAL TO QUO_CUST_APPROVAL_PROCESS
    QUO_CUST_APPROVE,       //Transition from QUO_CUST_APPROVED to AWAIT_TRANSACTION
    QUO_CUST_DECLINE,       //Transition from QUO_CUST_DECLINED to AWAIT_QUO

    TRANSACTION_MAKE,       //Transition from AWAIT_TRANSACTION TO TRANSACTION_PROCESS
    TRANSACTION_APPROVE,    //Transition from TRANSACTION_APPROVED TO IN_DESIGNING
    TRANSACTION_DECLINE,    //Transition from TRANSACTION_DECLINED TO AWAIT_TRANSACTION

    DES_FINISH,             //TRANSITION FROM IN_DESIGNING TO DES_AWAIT_MANA_APPROVAL
    DES_MANA_PROCESS,       //Transition from DES_AWAIT_MANA_APPROVAL to DES_MANA_APPROVAL_PROCESS
    DES_MANA_APPROVE,       //Transition from DES_MANA_APPROVED to DES_AWAIT_CUST_APPROVAL
    DES_MANA_DECLINE,       //Transition from DES_MANA_DECLINED to AWAIT_DES
    DES_CUST_PROCESS,       //Transition from DES_AWAIT_CUST_APPROVAL TO DES_CUST_APPROVAL_PROCESS
    DES_CUST_APPROVE,       //Transition from DES_CUST_APPROVED to IN_PRODUCTION
    DES_CUST_DECLINE,       //Transition from DES_CUST_DECLINED to AWAIT_DES

    PRO_FINISH,             //TRANSITION FROM IN_PRODUCTION TO PRO_AWAIT_APPROVAL
    PRO_PROCESS,            //Transition from PRO_AWAIT_APPROVAL to PRO_APPROVAL_PROCESS
    PRO_APPROVE,            //Transition from PRO_APPROVED to SENT
    PRO_DECLINE,            //Transition from PRO_DECLINED to IN_PRODUCTION

    TRAN_DELIVERED,         //TRANSITION FROM SENT TO DELIVERED

    ORDER_COMPLETE,         //TRANSITION FROM DELIVERED TO ORDER_COMPLETED
    CANCEL,                 //TRANSITION FROM EVERY STATE TO CANCEL
    RESTORE_ORDER           //TRANSITION FROM CANCEL TO ORDER_RESTORED
}
