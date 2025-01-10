#EN ESTE EJERCICIO NO HARÉ TIPADO
#KEY CONVENTION -> snake_case
#Nomenclatura -> [2.1.1.1 -> ejercicio 2 parte 1 punto 1 primera parte] [2.1.1.1 -> ejercicio 2 parte 1 punto 1 segunda parte]


import pandas as pd
import matplotlib.pyplot as plt

def dataframe_info(df):
    """Muestro información de un dataframe"""
    print("\nInfo general:")
    df.info()
    print("\nForma del df:", df.shape)

def dataframe_depura(df):
    """Limpio el dataframe introducido"""
    df = df.dropna(subset=['Poblacion'])#Elimino filas que no tengan valores en la columna crítica
    df = df[df['Poblacion'] >= 0] #o que tengan números negativos
    df['Poblacion'] = pd.to_numeric(df['Poblacion'], errors='coerce') #Convierto columna a numerica
    df = df.dropna(subset=['Poblacion']) #Elimino todas las filas que no se han podido convertir
    return df

# Diccionario para asignar continentes a los países (se hace para poder crear un df con continentes en el punto 4)
continente_dict = {
    'España': 'Europa', 'Francia': 'Europa', 'Alemania': 'Europa', 'Italia': 'Europa',
    'Marruecos': 'África', 'Nigeria': 'África', 'Sudáfrica': 'África',
    'China': 'Asia', 'India': 'Asia', 'Japón': 'Asia',
    'Estados Unidos': 'América del Norte', 'Canadá': 'América del Norte',
    'Brasil': 'Sudamérica', 'Argentina': 'Sudamérica', 'Chile': 'Sudamérica',
    'Australia': 'Oceanía', 'Nueva Zelanda': 'Oceanía'
}

def printea_encabezado(nombre):
    print(f"\n******************************** {nombre} ********************************")

def ej3():
    printea_encabezado("POBLACIÓN")
    no_esp = df[df['Pais'] != 'España'] #extraigo un df con los no españoles
    #3.2.1 Calculo de la población el porcentaje no nacido en españa diferenciando total, mujeres y hombres
    #obtengo los datos de la población total
    total_poblacion = df['Poblacion'].sum()
    total_hombres = df[df['Sexo'] == 'Hombres']['Poblacion'].sum()
    total_mujeres = df[df['Sexo'] == 'Mujeres']['Poblacion'].sum()
    #obtengo los datos de la población total de no españoles
    total_poblacion_no_esp = no_esp['Poblacion'].sum()
    total_hombres_no_esp = no_esp[no_esp['Sexo'] == 'Hombres']['Poblacion'].sum()
    total_mujeres_no_esp = no_esp[no_esp['Sexo'] == 'Mujeres']['Poblacion'].sum()
    #obtengo los porcentajes de la población y los dejo en 2 decimales
    porcentaje_poblacion_no_esp = (total_poblacion_no_esp / total_poblacion) * 100 #total
    porcentaje_poblacion_no_esp = round(porcentaje_poblacion_no_esp, 2)

    porcentaje_hombres_no_esp = (total_hombres_no_esp / total_hombres) * 100 #hombres
    porcentaje_hombres_no_esp = round(porcentaje_hombres_no_esp, 2)

    porcentaje_mujeres_no_esp = (total_mujeres_no_esp / total_mujeres) * 100 #mujeres
    porcentaje_mujeres_no_esp = round(porcentaje_mujeres_no_esp, 2)
    #3.2.1.2 Realizo las operaciones oportunas para obtener las salidas solicitadas
    esp = df[df['Pais'] == 'España'] #extraigo un df con los españoles
    #obtengo los totales de la población española
    total_poblacion_esp = esp['Poblacion'].sum() #total de nacidos en españa
    total_hombres_esp = esp[esp['Sexo'] == 'Hombres']['Poblacion'].sum() #total de hombres nacidos en españa
    total_mujeres_esp = esp[esp['Sexo'] == 'Mujeres']['Poblacion'].sum() #total de mujeres nacidas en españa
    #calculo los porcentajes de los datos totales y españoles y la muestro por pantalla junto a los datos anteriores
    #formateado como se solicita en el pdf
    porcentaje_hombres = (total_hombres / total_poblacion) * 100 #porcentaje total de hombres
    porcentaje_hombres = round(porcentaje_hombres, 2)
    print("Total poblacion hombres= \t\t\t\t", porcentaje_hombres, " %")

    porcentaje_mujeres = (total_mujeres / total_poblacion) * 100 #porcentaje total de mujeres
    porcentaje_mujeres = round(porcentaje_mujeres, 2)
    print("Total poblacion hombres= \t\t\t\t", porcentaje_mujeres, " %")

    porcentaje_esp = (total_poblacion_esp/total_poblacion) * 100 #porcentaje total nacidos en españa
    porcentaje_esp = round(porcentaje_esp, 2)
    print("Total poblacion nacida en España= \t\t\t", porcentaje_esp, " %")

    print("Total poblacion no nacida en España= \t\t\t", porcentaje_poblacion_no_esp, " %") #porcentaje total no nacidos en españa

    porcentaje_hombres_esp = (total_hombres_esp/total_hombres) * 100 #porcentaje total de hombres nacidos en españa
    porcentaje_hombres_esp = round(porcentaje_hombres_esp, 2)
    print("Total poblacion nacida en España/total hombres= \t", porcentaje_hombres_esp, " %") ##este print supongo que tiene un fallo, yo pondría Total hombres nacidos en España, pero me he ceñido al pdf

    porcentaje_mujeres_esp = (total_mujeres_esp/total_mujeres) * 100 #porcentaje total de mujeres nacidas en españa
    porcentaje_mujeres_esp = round(porcentaje_mujeres_esp, 2)
    print("Total poblacion nacida en España/ mujeres= \t\t", porcentaje_mujeres_esp, " %") #lo mismo que el comentario ## anterior

    print("Total poblacion no nacida en España/ total hombres= \t", porcentaje_hombres_no_esp, " %") #total de hombres no nacidos en españa

    print("Total poblacion no nacida en España/total mujeres= \t", porcentaje_mujeres_no_esp, " %") #total de mujeres no nacidas en españa
    printea_encabezado("POBLACIÓN")


if __name__ == "__main__":
    printea_encabezado("DF")
    df = pd.read_csv('pob_total1.csv', delimiter=';') #2.1.1.1 importo el csv (convertido de txt a csv manualmente)
    print("Primeras 15 líneas:\n", df.head(15)) #2.1.1.2
    dataframe_info(df) #2.1.2
    print("\nResumen de sus estadísticas:\n", df.describe()) #2.1.3
    printea_encabezado("DF")


    printea_encabezado("DF DEPURADO")
    df = dataframe_depura(df) #2.1.4 limpieza profunda
    dataframe_info(df) #2.1.5 muestro información del df depurado
    print("\nResumen de sus estadísticas:\n", df.describe()) #2.1.6 muestro resumen estadístico del df depurado
    ####DUDA 2.1.6 --> QUE COMPORTAMIENTO TENGO QUE EXPLICAR?
    ####DUDA 2.1.7 --> EN MI CASO, NO AHORRO MEMORIA, TODO LO CONTRARIO AHORA OCUPA LIGERAMENTE MÁS (POR EL TEMA DE CONVERSIÓN)
    printea_encabezado("DF DEPURADO")
          
    
    ej3()
    #4
    df['Continente'] = df['Pais'].map(continente_dict) #Añado una columna de continentes
    df_continentes = df.groupby(['Continente', 'Sexo'])['Poblacion'].sum().unstack().fillna(0) #Creo un nuevo df con los datos relevantes

    #Calculo los porcentajes
    df_continentes['Total'] = df_continentes['Hombres'] + df_continentes['Mujeres']
    df_continentes['% Hombres'] = (df_continentes['Hombres'] / df_continentes['Total']) * 100
    df_continentes['% Mujeres'] = (df_continentes['Mujeres'] / df_continentes['Total']) * 100

    #Calculo el porcentaje total para España
    df_esp = df[df['Pais'] == 'España'].groupby('Sexo')['Poblacion'].sum()
    total_esp = df_esp.sum()
    porcentaje_hombres_esp = (df_esp['Hombres'] / total_esp) * 100
    porcentaje_mujeres_esp = (df_esp['Mujeres'] / total_esp) * 100

    df_continentes.loc['España'] = [df_esp['Hombres'], df_esp['Mujeres'], total_esp, porcentaje_hombres_esp, porcentaje_mujeres_esp] #Añado los datos de España al df

    print("\nPorcentajes de hombres y mujeres por continente y España:\n", df_continentes[['% Hombres', '% Mujeres']])

    #5
    #Genero una gráfica de barras
    df_continentes[['% Hombres', '% Mujeres']].plot(kind='bar', figsize=(12, 6))
    plt.title('Porcentaje de Hombres y Mujeres por Continente y España')
    plt.ylabel('Porcentaje')
    plt.xlabel('Continente')
    plt.xticks(rotation=45)
    plt.tight_layout()
    plt.show()

    df[['Pais', 'Sexo', 'Poblacion']].to_csv('Manea_paises_depu.csv', index=False, sep=',') # Guardar el DataFrame depurado en un archivo CSV con delimitador "," y sin índice

    # Crear y guardar el DataFrame por continentes en un archivo CSV con delimitador ";"
    df_continentes.reset_index(inplace=True) #reseteo el index para que continente vuelva a ser una columna
    df_continentes[['Continente', 'Hombres', 'Mujeres']].to_csv('Manea_continentes.csv', index=False, sep=';')

    print("\nArchivos CSV generados correctamente")

    #6
    # Filtrar los datos de Polonia, Marruecos y Venezuela
    paises_seleccionados = ['Polonia', 'Marruecos', 'Venezuela']
    df_paises = df[df['Pais'].isin(paises_seleccionados)]

    # Gráfico de barras de la población total por país
    plt.figure(figsize=(10, 5))
    df_poblacion_total = df_paises[df_paises['Sexo'] == 'Total']
    plt.bar(df_poblacion_total['Pais'], df_poblacion_total['Poblacion'], color='royalblue')
    plt.title('Población total por país')
    plt.ylabel('Población (millones)')
    plt.xlabel('País')
    plt.show()

    # Preparación del segundo gráfico
    df_paises_genero = df_paises[df_paises['Sexo'] != 'Total']

    # Crear etiquetas personalizadas combinando país y género
    df_paises_genero['Etiqueta'] = df_paises_genero['Pais'] + '-' + df_paises_genero['Sexo']

    # Ordenar las etiquetas para que coincidan con el gráfico de la imagen
    etiquetas = df_paises_genero['Etiqueta'].values
    poblacion = df_paises_genero['Poblacion'].values

    # Gráfico de barras horizontal
    plt.figure(figsize=(12, 8))
    plt.barh(etiquetas, poblacion, color='cyan')
    plt.title('Comparativa de 3 países')
    plt.xlabel('Población (miles)')
    plt.tight_layout()
    plt.show()