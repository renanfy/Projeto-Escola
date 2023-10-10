package uniderp.poo.escola.repositorio;

import java.util.ArrayList;

public abstract class BaseGenericaCRUD<TFakeDB, TDominio> {
    public abstract void Create(TDominio instancia);

    public abstract void Read(int codigo);

    public abstract ArrayList<TDominio> ReadAll();

    public abstract void Update(TDominio instancia);

    public abstract void Delete(int codigo);

}
