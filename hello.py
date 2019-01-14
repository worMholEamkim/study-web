from random import randint


# 무작위로 정렬된 1 - 45 사이의 숫자 여섯개 뽑기
# 오름차순 리스트...이거 그건데 자료구조
# https://www.codeit.kr/assignments/140
def generate_numbers():
    lotto = []
    i = 0
    while i < 6:
        select = randint(1, 45)
        while select in lotto:
            select = randint(1, 45)
        lotto.append(select)
    lotto.sort()
    return lotto

# 보너스까지 포함해 7개 숫자 뽑기
# 정렬된 6개의 당첨 번호와 1개의 보너스 번호 리스트를 리턴
# 예: [1, 7, 13, 23, 31, 41, 15]
def draw_winning_numbers():
    lotto2 = []
    i = 0
    while i < 6:
        select = randint(1, 45)
        while select in lotto2:
            select = randint(1, 45)
        lotto2.append(select)
    lotto2.sort()
    bonus = randint(1, 45)
    lotto2.append(bonus)
    return lotto2

# 두 리스트에서 중복되는 숫자가 몇개인지 구하기
def count_matching_numbers(list1, list2):
    over_count = 0
    i = 0
    while i < int((range(list1)-1)):
        if list1[i] in list2:
            over_count += 1
            i += 1
        else:
            i += 1
    return over_count

# 로또 등수 확인하기
def check(numbers, winning_numbers):
    ranking = 0
    i = 0
    while i < int((range(numbers)-1)):
        if numbers[i] in winning_numbers:
            ranking += 1
            i += 1
        else:
            i += 1
    if ranking == 6:
        return 1000000000
    elif ranking == 5 and numbers[6] in winning_numbers:
        return 50000000
    elif ranking == 5:
        return 1000000
    elif ranking == 4:
        return 50000
    elif ranking == 3:
        return 5000



