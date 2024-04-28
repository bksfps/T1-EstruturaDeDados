import matplotlib.pyplot as plt

# Dados BubbleSort
tamanhos_bubble = [200000, 400000, 600000, 800000, 1000000, 1200000, 1400000]
tempos_bubble = [61895.75, 249473.75, 560858.25, 995186.9, 1561786.45, 2439783.75, 3206830.4]

# Dados InsertionSort
tamanhos_insertion = [200000, 400000, 600000, 800000, 1000000, 1200000, 1400000]
tempos_insertion = [4690.4, 18823.75, 43183.55, 81514.05, 140825.3, 220397.75, 317687.25]

# Dados SelectionSort
tamanhos_selection = [200000, 400000, 600000, 800000, 1000000, 1200000, 1400000]
tempos_selection = [10274.2, 45598.55, 111175.2, 210358.7, 402373.95, 913309.45, 738401.45]

# Gráficos
plt.figure(figsize=(20, 5))

# BubbleSort
plt.subplot(1, 3, 1)
plt.plot(tamanhos_bubble, tempos_bubble, marker='o', color='blue', label='BubbleSort')
plt.title('Desempenho do BubbleSort')
plt.xlabel('Tamanho do vetor')
plt.ylabel('Tempo médio (ms)')
plt.grid(True)
plt.legend()

# InsertionSort
plt.subplot(1, 3, 2)
plt.plot(tamanhos_insertion, tempos_insertion, marker='o', color='green', label='InsertionSort')
plt.title('Desempenho do InsertionSort')
plt.xlabel('Tamanho do vetor')
plt.ylabel('Tempo médio (ms)')
plt.grid(True)
plt.legend()

# SelectionSort
plt.subplot(1, 3, 3)
plt.plot(tamanhos_selection, tempos_selection, marker='o', color='red', label='SelectionSort')
plt.title('Desempenho do SelectionSort')
plt.xlabel('Tamanho do vetor')
plt.ylabel('Tempo médio (ms)')
plt.grid(True)
plt.legend()

plt.tight_layout()  # Garante que os gráficos não se sobreponham
plt.show()
