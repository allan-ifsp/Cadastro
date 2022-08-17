package br.edu.ifsp.scl.ads.pdm.allan.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.edu.ifsp.scl.ads.pdm.allan.cadastro.databinding.ActivityMainBinding;
import br.edu.ifsp.scl.ads.pdm.allan.cadastro.model.Formulario;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.salvarBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Formulario formulario = new Formulario();

                formulario.setNome(activityMainBinding.nomeET.getText().toString());
                formulario.setTelefone(activityMainBinding.telefoneET.getText().toString());
                formulario.setEmail(activityMainBinding.emailET.getText().toString());
                formulario.setCidade(activityMainBinding.cidadeET.getText().toString());

                if (activityMainBinding.salvarEmailCB.isChecked()){
                    formulario.setSalvarEmail(true);
                }else{
                    formulario.setSalvarEmail(false);
                }

                if (activityMainBinding.masculinoRB.isChecked()){
                    formulario.setSexo("masculino");
                }
                if (activityMainBinding.femininoRB.isChecked()){
                    formulario.setSexo("feminino");
                }

                formulario.setUF(activityMainBinding.ufSP.getSelectedItem().toString());

                System.out.println(formulario);
                Toast.makeText(getApplicationContext(), formulario.toString(), Toast.LENGTH_LONG).show();

            }
        });
        activityMainBinding.limparBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.nomeET.setText("");
                activityMainBinding.telefoneET.setText("");
                activityMainBinding.emailET.setText("");
                activityMainBinding.salvarEmailCB.setChecked(false);
                activityMainBinding.sexoRG.clearCheck();
                activityMainBinding.cidadeET.setText("");
                activityMainBinding.ufSP.setSelection(0);
            }
        });
    }
}
/*
nome
telefone
email
cadastrar email
sexo
cidade
uf
 */
