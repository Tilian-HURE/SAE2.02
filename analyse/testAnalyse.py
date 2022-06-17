import sys
sys.path.append('solutions/') # import python files from path 'analyse/solutions'
print(sys.setrecursionlimit(50000)) # set max recursion depth to 50000
from support import random_spaced_string
import codewars_test as test


# efficacite-21 :
import efficacite21
@test.describe('\n\n===== TEST DU PROGRAMME efficacite21 =====')
def sample_tests():
    @test.it("Chaîne de taille 1")
    def test1():
        string = random_spaced_string(1)
        test.assert_equals(efficacite21.erase(string), efficacite21.erase(string))
    
    @test.it("Chaîne de taille 10")
    def test2():
        string = random_spaced_string(10)
        test.assert_equals(efficacite21.erase(string), efficacite21.erase(string))

    @test.it("Chaîne de taille 100")
    def test3():
        string = random_spaced_string(100)
        test.assert_equals(efficacite21.erase(string), efficacite21.erase(string))

    @test.it("Chaîne de taille 1000")
    def test4():
        string = random_spaced_string(1000)
        test.assert_equals(efficacite21.erase(string), efficacite21.erase(string))

    @test.it("Chaîne de taille 10000")
    def test5():
        string = random_spaced_string(10000)
        test.assert_equals(efficacite21.erase(string), efficacite21.erase(string))


# efficacite-46 :
import efficacite46
@test.describe('\n\n===== TEST DU PROGRAMME efficacite46 =====')
def sample_tests():
    @test.it("Chaîne de taille 1")
    def test1():
        string = random_spaced_string(1)
        test.assert_equals(efficacite46.erase(string), efficacite46.erase(string))
    
    @test.it("Chaîne de taille 10")
    def test2():
        string = random_spaced_string(10)
        test.assert_equals(efficacite46.erase(string), efficacite46.erase(string))
    
    @test.it("Chaîne de taille 100")
    def test3():
        string = random_spaced_string(100)
        test.assert_equals(efficacite46.erase(string), efficacite46.erase(string))
    
    @test.it("Chaîne de taille 1000")
    def test4():
        string = random_spaced_string(1000)
        test.assert_equals(efficacite46.erase(string), efficacite46.erase(string))

    @test.it("Chaîne de taille 10000")
    def test5():
        string = random_spaced_string(10000)
        test.assert_equals(efficacite46.erase(string), efficacite46.erase(string))