-- 코드를 입력하세요
select FH.FLAVOR from FIRST_HALF FH
left join ICECREAM_INFO II on FH.FLAVOR = II.FLAVOR
where FH.TOTAL_ORDER > "3000" and II.INGREDIENT_TYPE = "fruit_based"
GROUP BY FH.FLAVOR
order by FH.TOTAL_ORDER desc
