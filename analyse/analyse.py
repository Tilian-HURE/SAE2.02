import sys
sys.path.append('solutions/') # import python files from path 'analyse/solutions'
from support import random_spaced_string
import codewars_test as test


# efficacite-21 :
import efficacite21
@test.describe('\n\n===== TEST DU PROGRAMME efficacite21 =====')
def sample_tests():
    @test.it("Chaîne de taille 5")
    def test1():
        string = random_spaced_string(5)
        test.assert_equals(efficacite21.erase(string), efficacite21.erase(string))

    @test.it("Chaîne de taille 15")
    def test1():
        string = random_spaced_string(15)
        test.assert_equals(efficacite21.erase(string), efficacite21.erase(string))

    @test.it("Chaîne de taille 30")
    def test1():
        string = random_spaced_string(30)
        test.assert_equals(efficacite21.erase(string), efficacite21.erase(string))