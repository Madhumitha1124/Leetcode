import pandas as pd

def employee_bonus(employee: pd.DataFrame, bonus: pd.DataFrame) -> pd.DataFrame:
    df=employee.merge(right=bonus,how='left',left_on='empId',right_on='empId')
    return df[(df['bonus'].isnull())|(df['bonus']<1000)][['name','bonus']]
    