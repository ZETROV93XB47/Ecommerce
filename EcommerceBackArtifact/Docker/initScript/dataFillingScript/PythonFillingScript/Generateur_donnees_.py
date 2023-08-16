from random import randint
from PIL import Image
import base64

def nameGen():
    tab = ['Sybill', 'Rylee', 'Cassidy', 'Coby', 'Brock', 'Florence', 'Wallace', 'Hermione', 'Tamara', 'Keane', 'Castor', 'Lacota', 'Brandon', 'Priscilla', 'Zelda', 'Zeus', 'Buckminster', 'Karina', 'Daniel', 'Isadora', 'Tasha', 'Sybil', 'Graham', 'Stacy', 'Nola', 'Carter', 'Callie', 'Zephania', 'Sydney', 'Graham', 'Robert', 'Anjolie', 'Grady', 'Macaulay', 'Medge', 'Belle', 'Glenna', 'Yeo', 'Irma', 'Kato', 'Faith', 'Phyllis', 'Jackson', 'Palmer', 'Hannah', 'Fulton', 'Callum', 'Griffith', 'Wendy', 'Erich', 'Basil', 'Eaton', 'Ross', 'Herman', 'Grant', 'Jemima', 'Cameran', 'Griffith', 'Akeem', 'Yeo', 'Maggie', 'Eric', 'Prescott', 'Carol', 'Jolie', 'Elmo', 'Julian', 'Nell', 'Hanna', 'Odette', 'Germane', 'Logan', 'Xander', 'Lacota', 'Delilah', 'Damian', 'Erasmus', 'Courtney', 'Yoshi', 'Nigel', 'Dana', 'Hoyt', 'Justina', 'Cody', 'Davis', 'Chancellor', 'Coby', 'Lawrence', 'Quin', 'Dustin', 'Madison', 'Francis', 'Kendall', 'Wyatt', 'Keegan', 'Matthew', 'Quentin', 'Tashya', 'Laith', 'Shaeleigh', 'Dale', 'Holcomb', 'Howe', 'Odom', 'Campos', 'Oneal', 'Chambers', 'Gardner', 'Stanley', 'Bauer', 'Fox', 'Stanley', 'Castaneda', 'Dillon', 'Rice', 'Hartman', 'Olson', 'Banks', 'Gordon', 'Park', 'Leach', 'Nichols', 'Herring', 'Hays', 'Melendez', 'Farley', 'Murphy', 'Estrada', 'Mann', 'Stone', 'Allen', 'Reed', 'Bruce', 'Branch', 'Watkins', 'Cantu', 'Guerrero', 'Brown', 'Phelps', 'Copeland', 'Buckley', 'Hebert', 'Griffith', 'Sexton', 'Bolton', 'Hubbard', 'Phillips', 'Dillard', 'Mcdonald', 'Barber', 'Henry', 'Valencia', 'Reid', 'Grant', 'Pittman', 'Horton', 'Pollard', 'Lane', 'Palmer', 'Lowery', 'Calderon', 'Santos', 'Mcdaniel', 'Peck', 'Johnston', 'Pruitt', 'Kirk', 'Alexander', 'Hill', 'Barron', 'Tucker', 'Joyner', 'Daniels', 'Contreras', 'Giles', 'William', 'Petersen', 'Owens', 'Woods', 'White', 'Dodson', 'Riley', 'May', 'Maxwell', 'Willis', 'Drake', 'Cantu', 'Rivera', 'Hatfield', 'Jimenez', 'Lambert', 'Huffman', 'Hubbard', 'Ware', 'White', 'Haley', 'Fuentes', 'Boone', 'Rosario', 'Reyes']
    return (tab[randint(0, (len(tab)-1))])

def sexGen():
    tab = ['M', 'F']
    return(tab[randint(0, (len(tab)-1))])

def sexGen2():
    tab = [1, 2]
    return(tab[randint(0, (len(tab)-1))])

def emailGen(nom, prenom):
    tab = ['@gmail.com', '@yahoo.fr', '@outlook.fr', '@hotmail.fr', '@yopmail.com', '@fictif.com', '@netflix.com', '@oracle.com', '@email.com', '@email.fr', '@lefou.com', '@supersayan.fr', '@cocorico.com', '@bestmail.com', '@toto.com', '@titi.com', '@tata.com', '@zizou.com', '@boomfaya.com', '@zumba.fr', '@tacos.fr', '@kebab.fr', '@reznov.ru', '@zetrov.ru', '@zakahev.ru', '@zeratul.ru']
    return (nom+prenom+ (tab[randint(0, (len(tab)-1))]))

#pour cette partie, les mots de passe apparaissent en clair pour l'instant, je n'ai pas encore installé bcrypt sur python pour les hasher, il n'est dispo que sur linux, du coup je vais le mettre à jour plus tard de façon à ce qu'il renvoie une chaine cryptée 
def mdpGen():
    chaine = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789&{([-_@)]}=+*$%!?"
    i = 0
    mdp = ''
    while( i < 20):
        mdp += chaine[randint(0, len(chaine)-1)]
        i+=1
    return mdp

def addressGen():
    adresse = ''
    tab = [' de la poucave ', ' du moulin', ' des temps', ' du radin', ' des fous', ' de la fete', ' des salades de fruits', ' des raclettes', ' de la fuerca', ' des putois', ' du feu']
    adresse += str(randint(1, 99))
    adresse += ' '
    adresse += 'Rue'
    adresse += ' '
    adresse += tab[randint(0, (len(tab)-1))]
    adresse += ' '
    adresse += str(randint(92000, 93000))
    return adresse

def dateGen():
    date = ''
    date += str(randint(1975, 2000))
    date += '-'
    date += str(randint(1, 12))
    date += '-'
    date += str(randint(1, 28))
    return date


def dateCommandesGen():
    return (str(randint(2015, 2020)) + '-' + str(randint(1, 12)) + '-' + str(randint(1, 31)))

def idClientGen():
    return str(randint(1, 100))


def genAllergies():
    return('')


#Je dois y aller, j'ai grave faim



def queryCommandesGen(i):
    return ( 'INSERT INTO commandes VALUES (' + str(i) + ", " + idClientGen() + ", '" + dateCommandesGen() + ' 10:15:20' +"');")


def queryGenClient(i):
    req = "INSERT INTO clients (Email, Id_cl, Nom, Prenom, Sexe, Adresse, Dt, Mdp) VALUES ('"
    nom = nameGen()
    prenom = nameGen()
    req += emailGen(nom, prenom)
    req += "', '"
    req += str(i) + "' ,"
    req += "'"
    req += nom
    req += "', '"
    req += prenom
    req += "', '"
    req += sexGen()
    req += "', '"
    req += addressGen()
    req += "', '"
    req += dateGen()
    req += "', '"
    req += mdpGen()
    req += "'"
    req += ");"
    return req



def queryGenClient2(i):
    req = "INSERT INTO clients (Email, Id_cl, Nom, Prenom, Sexe, Adresse, Dt, Mdp) VALUES ('"
    nom = nameGen()
    prenom = nameGen()
    req += emailGen(nom, prenom)
    req += "', '"
    req += str(i) + "' ,"
    req += "'"
    req += nom
    req += "', '"
    req += prenom
    req += "', "
    req += str(sexGen2())
    req += ", '"
    req += addressGen()
    req += "', '"
    req += dateGen()
    req += "', '"
    req += mdpGen()
    req += "'"
    req += ");"
    return req


def convertToBase64(imagePath):
    with open(imagePath, "rb") as f:
        return base64.b64encode(f.read())



def genPrix():
    return str(randint(700, 2000))


def genMarque():
    #tab = ["Asus", "HP", "Lenovo", "DELL", "AORUS", "MSI", "Acer", "Toshiba", "Alienware"]
    tab = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    return (tab[randint(0, (len(tab)-1))])

def genNomP():
    tab = ["Asus", "HP", "Lenovo", "DELL", "AORUS", "MSI", "Acer", "Toshiba", "Alienware"]
    return (tab[randint(0, (len(tab)-1))])

def genCategorie():
    #tab = ["Gaming", "Notebook"]
    tab = [1, 2]
    return tab[randint(0, (len(tab)-1))]

def genCPU(x):
    tab = ["AMD Ryzen 5 3550H", "Intel Core i7 9750H", "Intel Core i9 9880H", "Intel Core i7 8750H", "Intel Core i5 9300H", "Intel Core i5 8300H", "Intel Core i7 7700HQ", "Intel Core i7 9700K", "AMD Ryzen 7 3750H", "Intel Core i7 8700", "Intel Core i9 9880H"]
    tab2 = ["Intel Core i5 10210U", "Intel Core i7 10710U", "Intel Core i5 8265U", "Intel Celeron N4000", "Intel Celeron N3350", "Intel Pentium Gold 4415Y", "Intel Core i5 8200Y", "Intel Pentium Silver N5000", "Intel Core i3 6006U", "Intel Core i5 8265U", "AMD Ryzen 5 3500U"]
    if(x == "Gaming"):
        return ((tab[randint(0, (len(tab)-1))]))
    else:
        return ((tab[randint(0, (len(tab2)-1))]))


def genOS():
    tab = ["Windows 10 ", "Sans OS "]
    return (tab[randint(0, (len(tab)-1))])

def genRAM(x):
    tab = ["16 Go", "32 Go"]
    if(x == "Gaming"):
        return tab[randint(0, (len(tab)-1))]
    else:
        return ("8 Go")

def genGPU(x):
    tab2 = ["Intel HD Graphics 620", "Intel HD Graphics 615", "Intel HD Graphics 610", "Intel HD Graphics 520", "Intel HD Graphics 605", "Intel HD Graphics 515", "Intel HD Graphics 500", "Intel HD Graphics 505", "Intel Iris Plus Graphics"]
    tab = [ "NVIDIA GeForce GTX 1660 Ti 6 Go",  "NVIDIA GeForce RTX 2070 8 Go", "NVIDIA GeForce RTX 2080 8 Go", "NVIDIA GeForce GTX 1650 4 Go", "NVIDIA GeForce RTX 2060 6 Go", "NVIDIA GeForce GTX 1070 8 Go", "NVIDIA GeForce GTX 1080 8 Go", "NVIDIA GeForce GTX 1050 Ti 4 Go", "NVIDIA GeForce GTX 1050 2 Go", "NVIDIA GeForce GTX 1060 3 Go", "NVIDIA GeForce GTX 1060 6 Go", "AMD Radeon 520", "AMD Radeon 530", "AMD Radeon R2", "AMD Radeon R3", "AMD Radeon R5", "AMD Radeon RX 5500M", "AMD Radeon RX 560X", "AMD Radeon RX Vega 10 Graphics"]
    if(x =="Gaming"):
        return (tab[randint(0, (len(tab)-1))])
    else:
        return (tab2[randint(0, (len(tab2)-1))])

def genDD():
    tab = ["HDD 1 To", "HDD 500 Go"]
    return (tab[randint(0, (len(tab)-1))])

def genSSD():
    tab = ["SSD 256 Go", "SSD 1 TO", "SSD 512 Go", "SSD 128 Go"]
    return (tab[(randint(0, (len(tab)-1)))])

def genNom():
    x = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    j =""
    i = 0
    while( i < 5):
        j += (x[randint(0, len(x)-1)])
        i+=1
    return (j)


def genStock():
    return (randint(1, 100))


def genDiaGonale():
    tab = ["15", "17", "18", "14", "13", "16"]
    return str((tab[randint(0, (len(tab)-1))]))


def genConnectivite():
    tab = ["WiFi AC/Bluetooth", "WiFi AX/Bluetooth", "WiFi AC/Bluetooth/4G", "WiFi AX/Bluetooth/4G"]
    return str(tab[randint(0, (len(tab)-1))])

def genEcran():
    #tab = ["LCD", "IPS", "TN", "VA", "AMVA", "PVA", "AMVA+"]
    tab = [1,2,3,4,5,6,7]
    return tab[randint(0, (len(tab)-1))]

def genPhoto(marque, typepc, i):
    if(typepc == "Gaming"):
        return  ("http://localhost/Tests/ProjetBDD/BDD/Images/PC" + "/"+marque + "/"+ typepc + "/"+ marque + "(" + str(i) + ")"+".jpg")
    else:
        return  ("http://localhost/Tests/ProjetBDD/BDD/Images/PC" + "/"+ marque + "/"+ marque + "(" + str(i) + ")"+".jpg")

def genPhoto2(marque, typepc, i):
    if(typepc == 1):#gaming
        #LOAD_FILE('/var/lib/mysql-files/Images/PC/Acer/Acer(0).jpg')
        return  ("LOAD_FILE('/var/lib/mysql-files/Images/PC/" + brandConverter(marque) + "/"+ categoryConverter(typepc) + "/"+ brandConverter(marque) + "(" + str(i) + ")"+".jpg')")
    else:
        return  ("LOAD_FILE('/var/lib/mysql-files/Images/PC/" + brandConverter(marque) + "/"+ brandConverter(marque) + "(" + str(i) + ")"+".jpg')")


def brandConverter(brandNumber):
    brandNumber-=1
    tab = ["Asus", "HP", "Lenovo", "DELL", "AORUS", "MSI", "Acer", "Toshiba", "Alienware"]
    return tab[brandNumber] 

def categoryConverter(categoryNumber):
    categoryNumber-=1
    tab = ["Gaming", "Notebook"]
    print(categoryNumber)
    return tab[categoryNumber]

def displayTypeConverter(displayTypeNumber):
    #tab = ["LCD", "IPS", "TN", "VA", "AMVA", "PVA", "AMVA+"]
    displayTypeNumber-=1
    tab = ["VA", "LCD", "PVA", "AMVA", "AMVA+", "IPS", "TN"]
    return tab[displayTypeNumber]

def queryProduits(i):

    marque = genMarque()
    categorie = genCategorie()
    nom = genNom()
    prix = genPrix()
    CPU = genCPU(categorie)
    GPU = genGPU(categorie)
    RAM = genRAM(categorie)
    DD = genDD()
    SSD = genSSD()
    ecran = genEcran()
    Diagonale = genDiaGonale()
    OS = genOS()
    connect = genConnectivite()
    photo = genPhoto2(marque, categorie, randint(0, 2))
    stock = genStock()
    # test = (str(marque+' '+categorie+' '+nom+' '+CPU+' '+GPU+' '+RAM+' '+DD+' '+SSD+' '+ecran+' '+Diagonale+' '+OS+' '+connect))
    return ("INSERT INTO produits VALUES ("+str(i)+", '"+brandConverter(marque)+" "+nom+"', "+str(prix)+", "+str(marque)+", "+str(categorie)+", '"+CPU+"', '"+GPU+"', '"+RAM+"', '"+DD+"', '"+SSD+"', "+str(ecran)+", "+Diagonale+", '"+OS+"', '"+connect+"', "+str(photo)+", "+str(stock)+ ", "+"'"+ str(brandConverter(marque)+' '+categoryConverter(categorie)+' '+nom+' '+CPU+' '+GPU+' '+RAM+' '+DD+' '+SSD+' '+displayTypeConverter(ecran)+' '+Diagonale+' '+OS+' '+connect) +"'"+");")


    # print("INSERT INTO Produits VALUES ("+str(i)+", '"+marque+" "+nom+"', "+str(prix)+", '"+marque+"', '"+categorie+"', '"+CPU+"', '"+GPU+"', '"+RAM+"', '"+DD+"', '"+SSD+"', '"+ecran+"', "+Diagonale+", '"+OS+"', '"+connect+"', '"+photo+"', "+str(stock)+ ", "+"'"+ str(marque+' '+categorie+' '+nom+' '+str(prix)+' '+CPU+' '+GPU+' '+RAM+' '+DD+' '+SSD+' '+ecran+' '+Diagonale+' '+OS+' '+connect+' '+photo+' '+ str(stock)) +"'"+");")


def queryDetails_cmd(i):
#rien n'interdit le fait que pour la même commande ou le même ID de commande, on ait plusieurs produits associés
    return ("INSERT INTO Details_cmd VALUES (" + str(i) + ", " + str(i) + ", " + str(i*3) + ", " + str(randint(1, 5))+ ");")


#############################################################################################################################################################################################################################################################################################################################################


i = 1

fichier = open("produits3.sql", "a")
while (i < 1001):
    fichier.write("\n" + queryProduits(i))
    i+=1
fichier.close()
# 
# 
# i = 1
# 
# fichier = open("GenTables\commandes.sql", "a")
# while (i < 201):
    # fichier.write("\n" + queryCommandesGen(i))
    # i+=1
# fichier.close()


# i = 1
# 
# fichier = open("GenTables\Details_cmd.sql", "a")
# while (i < 201):
    # fichier.write("\n" + queryDetails_cmd(i))
    # i+=1
# fichier.close()
# 
# 