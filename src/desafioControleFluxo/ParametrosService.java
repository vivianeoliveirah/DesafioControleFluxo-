package desafioControleFluxo;

public interface ParametrosService {
    void validarParametros(int parametroUm, int parametroDois) throws ParametrosInvalidosException;
}