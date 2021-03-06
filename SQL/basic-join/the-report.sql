SELECT IF(T2.GRADE > 7, T1.NAME, NULL), T2.GRADE, T1.MARKS FROM STUDENTS T1
    INNER JOIN GRADES T2 ON T1.MARKS BETWEEN T2.MIN_MARK AND T2.MAX_MARK
    ORDER BY T2.GRADE DESC, T1.NAME
